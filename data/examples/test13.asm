# All program code is placed after the
# .text assembler directive
.text

# Declare main as a global function
.globl	main

j main

# code for main
main:
# Entering a new scope.
# Symbols in symbol table:
#  a
#  println
#  i
#  return
# Update the stack pointer.
addi $sp $sp -0
# println
la $a0 datalabel0
li $v0 4
syscall
la $a0 newline
li $v0 4
syscall
# Get a's offset from $sp from the symbol table and initialize a's address with it. We'll add $sp later.
li $t0 -40
# Add the stack pointer address to the offset.
add $t0 $t0 $sp
# Evaluate the index expression and store in a register.
li $t1 0
# Multiply the index by -4.
li $t2 4
mul $t1 $t1 $t2
# Add the index offset to the offset.
add $t0 $t0 $t1
# Compute rhs for assignment =
li $t1 0
# complete assignment statement with store
sw $t1 0($t0)
# println
# Get a's offset from $sp from the symbol table and initialize a's address with it. We'll add $sp later.
li $t1 -40
# Add the stack pointer address to the offset.
add $t1 $t1 $sp
# Evaluate the index expression and store in a register.
li $t2 0
# Multiply the index by -4.
li $t3 4
mul $t2 $t2 $t3
# Add the index offset to the offset.
add $t1 $t1 $t2
# Load the value of a.
lw $t0 0($t1)
move $a0 $t0
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
# Get a's offset from $sp from the symbol table and initialize a's address with it. We'll add $sp later.
li $t0 -40
# Add the stack pointer address to the offset.
add $t0 $t0 $sp
# Evaluate the index expression and store in a register.
li $t1 2
# Multiply the index by -4.
li $t2 4
mul $t1 $t1 $t2
# Add the index offset to the offset.
add $t0 $t0 $t1
# Compute rhs for assignment =
li $t1 2
# complete assignment statement with store
sw $t1 0($t0)
# println
# Get a's offset from $sp from the symbol table and initialize a's address with it. We'll add $sp later.
li $t1 -40
# Add the stack pointer address to the offset.
add $t1 $t1 $sp
# Evaluate the index expression and store in a register.
li $t2 2
# Multiply the index by -4.
li $t3 4
mul $t2 $t2 $t3
# Add the index offset to the offset.
add $t1 $t1 $t2
# Load the value of a.
lw $t0 0($t1)
move $a0 $t0
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t0 -44
# Add the stack pointer address to the offset.
add $t0 $t0 $sp
# Compute rhs for assignment =
li $t1 2
# complete assignment statement with store
sw $t1 0($t0)
# Get a's offset from $sp from the symbol table and initialize a's address with it. We'll add $sp later.
li $t0 -40
# Add the stack pointer address to the offset.
add $t0 $t0 $sp
# Evaluate the index expression and store in a register.
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t2 -44
# Add the stack pointer address to the offset.
add $t2 $t2 $sp
# Load the value of i.
lw $t1 0($t2)
# Multiply the index by -4.
li $t2 4
mul $t1 $t1 $t2
# Add the index offset to the offset.
add $t0 $t0 $t1
# Compute rhs for assignment =
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t2 -44
# Add the stack pointer address to the offset.
add $t2 $t2 $sp
# Load the value of i.
lw $t1 0($t2)
# complete assignment statement with store
sw $t1 0($t0)
# println
# Get a's offset from $sp from the symbol table and initialize a's address with it. We'll add $sp later.
li $t1 -40
# Add the stack pointer address to the offset.
add $t1 $t1 $sp
# Evaluate the index expression and store in a register.
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t3 -44
# Add the stack pointer address to the offset.
add $t3 $t3 $sp
# Load the value of i.
lw $t2 0($t3)
# Multiply the index by -4.
li $t3 4
mul $t2 $t2 $t3
# Add the index offset to the offset.
add $t1 $t1 $t2
# Load the value of a.
lw $t0 0($t1)
move $a0 $t0
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t0 -44
# Add the stack pointer address to the offset.
add $t0 $t0 $sp
# Compute rhs for assignment =
li $t1 0
# complete assignment statement with store
sw $t1 0($t0)
datalabel1:
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t1 -44
# Add the stack pointer address to the offset.
add $t1 $t1 $sp
# Load the value of i.
lw $t0 0($t1)
li $t1 10
slt $t0 $t0 $t1
subi $t0 $t0 1
bne $t0 $zero datalabel2
# Entering a new scope.
# Symbols in symbol table:
#  println
# Update the stack pointer.
addi $sp $sp -44
# Get a's offset from $sp from the symbol table and initialize a's address with it. We'll add $sp later.
li $t0 4
# Add the stack pointer address to the offset.
add $t0 $t0 $sp
# Evaluate the index expression and store in a register.
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t2 0
# Add the stack pointer address to the offset.
add $t2 $t2 $sp
# Load the value of i.
lw $t1 0($t2)
# Multiply the index by -4.
li $t2 4
mul $t1 $t1 $t2
# Add the index offset to the offset.
add $t0 $t0 $t1
# Compute rhs for assignment =
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t2 0
# Add the stack pointer address to the offset.
add $t2 $t2 $sp
# Load the value of i.
lw $t1 0($t2)
# complete assignment statement with store
sw $t1 0($t0)
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t0 0
# Add the stack pointer address to the offset.
add $t0 $t0 $sp
# Compute rhs for assignment =
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t2 0
# Add the stack pointer address to the offset.
add $t2 $t2 $sp
# Load the value of i.
lw $t1 0($t2)
li $t2 1
add $t1 $t1 $t2
# complete assignment statement with store
sw $t1 0($t0)
# Exiting scope.
addi $sp $sp 44
j datalabel1
datalabel2:
# println
# Get a's offset from $sp from the symbol table and initialize a's address with it. We'll add $sp later.
li $t1 -40
# Add the stack pointer address to the offset.
add $t1 $t1 $sp
# Evaluate the index expression and store in a register.
li $t2 3
# Multiply the index by -4.
li $t3 4
mul $t2 $t2 $t3
# Add the index offset to the offset.
add $t1 $t1 $t2
# Load the value of a.
lw $t0 0($t1)
move $a0 $t0
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
# println
# Get a's offset from $sp from the symbol table and initialize a's address with it. We'll add $sp later.
li $t1 -40
# Add the stack pointer address to the offset.
add $t1 $t1 $sp
# Evaluate the index expression and store in a register.
li $t2 6
# Multiply the index by -4.
li $t3 4
mul $t2 $t2 $t3
# Add the index offset to the offset.
add $t1 $t1 $t2
# Load the value of a.
lw $t0 0($t1)
move $a0 $t0
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
# println
# Get a's offset from $sp from the symbol table and initialize a's address with it. We'll add $sp later.
li $t1 -40
# Add the stack pointer address to the offset.
add $t1 $t1 $sp
# Evaluate the index expression and store in a register.
li $t2 6
# Multiply the index by -4.
li $t3 4
mul $t2 $t2 $t3
# Add the index offset to the offset.
add $t1 $t1 $t2
# Load the value of a.
lw $t0 0($t1)
li $t1 6
mult $t0 $t1
mflo $t0
move $a0 $t0
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
# Exiting scope.
addi $sp $sp 0
li $v0 10
syscall

# All memory structures are placed after the
# .data assembler directive
.data

newline:	.asciiz	"\n"
datalabel0:	.asciiz	"This should print 0, 2, 2, 3, 6 and 36"
