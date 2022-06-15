/*
 */
package submit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import submit.ast.VarType;

/**
 *
 *
 *
 */
public final class RegisterAllocator {

    // True if t is used
    private final boolean[] t = new boolean[10];
    private final boolean[] s = new boolean[8];
    private final Set<String> used = new HashSet<>();

    public RegisterAllocator() {
        clearAll();
    }

    public static MIPSResult writeLoadAddress(StringBuilder code, RegisterAllocator regAllocator, MIPSResult res) {
        String register = regAllocator.getAny();
        String address = res.getAddress();
        // String operation = "la";
        // if (res.getType() == VarType.STRING || res.getType() VarType.CHAR) {

        // } else {

        // }

        if (res.getType() == VarType.INT) {
            code.append(String.format("lw %s 0(%s)\n", register, address));
            if (address.startsWith("$")) {
                regAllocator.clear(address);
            }

        } else {
            code.append(String.format("la %s, %s\n", register, address));
        }

        res = MIPSResult.createRegisterResult(register, res.getType());
        return res;
    }

    public String getT() {
        for (int i = 0; i < t.length; ++i) {
            if (!t[i]) {
                t[i] = true;
                String str = "$t" + i;
                used.add(str);
                return str;
            }
        }
        return null;
    }

    // public String getS() {
    // for (int i = 0; i < s.length; ++i) {
    // if (!s[i]) {
    // s[i] = true;
    // String str = "$s" + i;
    // used.add(str);
    // return str;
    // }
    // }
    // return null;
    // }

    // Returns the number of bytes used to save the registers
    public int saveRestore(StringBuilder code, int baseOffset, boolean s_or_t, boolean save) {
        boolean[] r = s;
        String prefix = "$s";
        if (!s_or_t) {
            r = t;
            prefix = "$t";
        }
        String instruction = "sw";
        if (!save) {
            instruction = "lw";
        }
        int offset = 0;
        for (int i = 0; i < r.length; ++i) {
            if (r[i]) {
                offset -= 4;
                String str = prefix + i;
                code.append(instruction).append(" ").append(str).append(" ").append(offset + baseOffset)
                        .append("($sp)\n");
            }
        }
        return -offset;
    }

    // public int saveS(StringBuilder code, int baseOffset) {
    // return saveRestore(code, baseOffset, true, true);
    // }

    public int saveT(StringBuilder code, int baseOffset) {
        return saveRestore(code, baseOffset, false, true);
    }

    // public int restoreS(StringBuilder code, int baseOffset) {
    // return saveRestore(code, baseOffset, true, false);
    // }

    public int restoreT(StringBuilder code, int baseOffset) {
        return saveRestore(code, baseOffset, false, false);
    }

    public List<String> getUsed() {
        return new ArrayList<>(used);
    }

    /**
     * Any time you call this method you should seriously consider adding a
     * corresponding clear() call.
     *
     * @return
     */
    public String getAny() {
        // String availS = getS();
        // if (availS != null) {
        // return availS;
        // }
        String t = getT();
        if (t == null) {
            throw new RuntimeException("Out of registers");
        }
        return t;
    }

    public void clear(String reg) {
        if (reg.charAt(1) == 's') {
            s[Integer.parseInt(reg.substring(2))] = false;
        } else if (reg.charAt(1) == 't') {
            t[Integer.parseInt(reg.substring(2))] = false;
        } else {
            throw new RuntimeException("Unexpected register in clear");
        }
    }

    public void clearAll() {
        Arrays.fill(t, false);
        Arrays.fill(s, false);
    }
}
