# All program code is placed after the
# .text assembler directive
.text

# Declare main as a global function
.globl	main

j main

# code for foo
foo:
# Entering a new scope.
# Symbols in symbol table:
#  println
#  return
# Update the stack pointer.
addi $sp $sp -0
# println
li $t0 7
move $a0 $t0
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
# Exiting scope.
addi $sp $sp 0
jr $ra

# code for fum
fum:
# Entering a new scope.
# Symbols in symbol table:
#  a
#  println
#  b
#  return
# Update the stack pointer.
addi $sp $sp -0
# Get a's offset from $sp from the symbol table and initialize a's address with it. We'll add $sp later.
li $t0 -4
# Add the stack pointer address to the offset.
add $t0 $t0 $sp
# Compute rhs for assignment =
li $t1 9
# complete assignment statement with store
sw $t1 0($t0)
# Get b's offset from $sp from the symbol table and initialize b's address with it. We'll add $sp later.
li $t0 -8
# Add the stack pointer address to the offset.
add $t0 $t0 $sp
# Compute rhs for assignment =
li $t1 12
# complete assignment statement with store
sw $t1 0($t0)
# println
# Get b's offset from $sp from the symbol table and initialize b's address with it. We'll add $sp later.
li $t1 -8
# Add the stack pointer address to the offset.
add $t1 $t1 $sp
# Load the value of b.
lw $t0 0($t1)
# Get a's offset from $sp from the symbol table and initialize a's address with it. We'll add $sp later.
li $t2 -4
# Add the stack pointer address to the offset.
add $t2 $t2 $sp
# Load the value of a.
lw $t1 0($t2)
sub $t0 $t0 $t1
li $t1 4
add $t0 $t0 $t1
move $a0 $t0
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
# Calling function foo
# Save $ra to a register
move $t0 $ra
# Save $t0-9 registers
sw $t0 -12($sp)
# Evaluate parameters and save to stack
# Update the stack pointer
add $sp $sp -12
# Call the function
jal foo
# Restore the stack pointer
add $sp $sp 12
# Restore $t0-9 registers
lw $t0 -12($sp)
# Restore $ra
move $ra $t0
# Exiting scope.
addi $sp $sp 0
jr $ra

# code for main
main:
# Entering a new scope.
# Symbols in symbol table:
#  println
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
# Calling function foo
# Save $ra to a register
move $t0 $ra
# Save $t0-9 registers
sw $t0 -4($sp)
# Evaluate parameters and save to stack
# Update the stack pointer
add $sp $sp -4
# Call the function
jal foo
# Restore the stack pointer
add $sp $sp 4
# Restore $t0-9 registers
lw $t0 -4($sp)
# Restore $ra
move $ra $t0
# Calling function fum
# Save $ra to a register
move $t0 $ra
# Save $t0-9 registers
sw $t0 -4($sp)
# Evaluate parameters and save to stack
# Update the stack pointer
add $sp $sp -4
# Call the function
jal fum
# Restore the stack pointer
add $sp $sp 4
# Restore $t0-9 registers
lw $t0 -4($sp)
# Restore $ra
move $ra $t0
# Exiting scope.
addi $sp $sp 0
li $v0 10
syscall

# All memory structures are placed after the
# .data assembler directive
.data

newline:	.asciiz	"\n"
datalabel0:	.asciiz	"This program prints 7 7 7"
