# All program code is placed after the
# .text assembler directive
.text

# Declare main as a global function
.globl	main

j main

# code for fib
fib:
# Entering a new scope.
# Symbols in symbol table:
#  println
#  i
#  return
# Update the stack pointer.
addi $sp $sp -0
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t1 -4
# Add the stack pointer address to the offset.
add $t1 $t1 $sp
# Load the value of i.
lw $t0 0($t1)
li $t1 0
sub $t0 $t0 $t1
bne $t0 $zero datalabel0
li $t0 1
sw $t0 -8($sp)
jr $ra
j datalabel1
datalabel0:
datalabel1:
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t1 -4
# Add the stack pointer address to the offset.
add $t1 $t1 $sp
# Load the value of i.
lw $t0 0($t1)
li $t1 1
sub $t0 $t0 $t1
bne $t0 $zero datalabel2
li $t0 1
sw $t0 -8($sp)
jr $ra
j datalabel3
datalabel2:
datalabel3:
# Calling function fib
# Save $ra to a register
move $t0 $ra
# Save $t0-9 registers
sw $t0 -12($sp)
# Evaluate parameters and save to stack
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t2 -4
# Add the stack pointer address to the offset.
add $t2 $t2 $sp
# Load the value of i.
lw $t1 0($t2)
li $t2 1
sub $t1 $t1 $t2
sw $t1 -16($sp)
# Update the stack pointer
add $sp $sp -12
# Call the function
jal fib
# Restore the stack pointer
add $sp $sp 12
# Restore $t0-9 registers
lw $t0 -12($sp)
# Restore $ra
move $ra $t0
# Get return value off stack
lw $t0 -20($sp)
# Calling function fib
# Save $ra to a register
move $t1 $ra
# Save $t0-9 registers
sw $t0 -12($sp)
sw $t1 -16($sp)
# Evaluate parameters and save to stack
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t3 -4
# Add the stack pointer address to the offset.
add $t3 $t3 $sp
# Load the value of i.
lw $t2 0($t3)
li $t3 2
sub $t2 $t2 $t3
sw $t2 -20($sp)
# Update the stack pointer
add $sp $sp -16
# Call the function
jal fib
# Restore the stack pointer
add $sp $sp 16
# Restore $t0-9 registers
lw $t0 -12($sp)
lw $t1 -16($sp)
# Restore $ra
move $ra $t1
# Get return value off stack
lw $t1 -24($sp)
add $t0 $t0 $t1
sw $t0 -8($sp)
jr $ra
# Exiting scope.
addi $sp $sp 0
jr $ra

# code for main
main:
# Entering a new scope.
# Symbols in symbol table:
#  println
#  i
#  return
# Update the stack pointer.
addi $sp $sp -0
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t0 -4
# Add the stack pointer address to the offset.
add $t0 $t0 $sp
# Compute rhs for assignment =
li $t1 0
# complete assignment statement with store
sw $t1 0($t0)
# println
la $a0 datalabel4
li $v0 4
syscall
la $a0 newline
li $v0 4
syscall
datalabel5:
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t1 -4
# Add the stack pointer address to the offset.
add $t1 $t1 $sp
# Load the value of i.
lw $t0 0($t1)
li $t1 12
slt $t0 $t0 $t1
subi $t0 $t0 1
bne $t0 $zero datalabel6
# Entering a new scope.
# Symbols in symbol table:
#  println
# Update the stack pointer.
addi $sp $sp -4
# println
# Calling function fib
# Save $ra to a register
move $t0 $ra
# Save $t0-9 registers
sw $t0 -4($sp)
# Evaluate parameters and save to stack
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t2 0
# Add the stack pointer address to the offset.
add $t2 $t2 $sp
# Load the value of i.
lw $t1 0($t2)
sw $t1 -8($sp)
# Update the stack pointer
add $sp $sp -4
# Call the function
jal fib
# Restore the stack pointer
add $sp $sp 4
# Restore $t0-9 registers
lw $t0 -4($sp)
# Restore $ra
move $ra $t0
# Get return value off stack
lw $t0 -12($sp)
move $a0 $t0
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
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
addi $sp $sp 4
j datalabel5
datalabel6:
# Exiting scope.
addi $sp $sp 0
li $v0 10
syscall

# All memory structures are placed after the
# .data assembler directive
.data

newline:	.asciiz	"\n"
datalabel4:	.asciiz	"This program prints the first 12 numbers of the Fibonacci sequence."
