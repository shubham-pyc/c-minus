# All program code is placed after the
# .text assembler directive
.text

# Declare main as a global function
.globl	main

j main

# code for sum
sum:
# Entering a new scope.
# Symbols in symbol table:
#  println
#  x
#  i
#  sum
#  n
#  return
# Update the stack pointer.
addi $sp $sp -0
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t0 -16
# Add the stack pointer address to the offset.
add $t0 $t0 $sp
# Compute rhs for assignment =
li $t1 0
# complete assignment statement with store
sw $t1 0($t0)
# Get sum's offset from $sp from the symbol table and initialize sum's address with it. We'll add $sp later.
li $t0 -20
# Add the stack pointer address to the offset.
add $t0 $t0 $sp
# Compute rhs for assignment =
li $t1 0
# complete assignment statement with store
sw $t1 0($t0)
datalabel0:
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t1 -16
# Add the stack pointer address to the offset.
add $t1 $t1 $sp
# Load the value of i.
lw $t0 0($t1)
# Get n's offset from $sp from the symbol table and initialize n's address with it. We'll add $sp later.
li $t2 -8
# Add the stack pointer address to the offset.
add $t2 $t2 $sp
# Load the value of n.
lw $t1 0($t2)
slt $t0 $t0 $t1
subi $t0 $t0 1
bne $t0 $zero datalabel1
# Entering a new scope.
# Symbols in symbol table:
#  println
# Update the stack pointer.
addi $sp $sp -20
# Get sum's offset from $sp from the symbol table and initialize sum's address with it. We'll add $sp later.
li $t0 0
# Add the stack pointer address to the offset.
add $t0 $t0 $sp
# Compute rhs for assignment =
# Get sum's offset from $sp from the symbol table and initialize sum's address with it. We'll add $sp later.
li $t2 0
# Add the stack pointer address to the offset.
add $t2 $t2 $sp
# Load the value of sum.
lw $t1 0($t2)
# Get x's offset from $sp from the symbol table and initialize x's address with it. We'll add $sp later.
li $t3 16
# Add the stack pointer address to the offset.
add $t3 $t3 $sp
# Get x's base address from the stack.
lw $t3 0($t3)
# Evaluate the index expression and store in a register.
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t5 4
# Add the stack pointer address to the offset.
add $t5 $t5 $sp
# Load the value of i.
lw $t4 0($t5)
# Multiply the index by -4.
li $t5 4
mul $t4 $t4 $t5
# Add the index offset to the offset.
add $t3 $t3 $t4
# Load the value of x.
lw $t2 0($t3)
add $t1 $t1 $t2
# complete assignment statement with store
sw $t1 0($t0)
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t0 4
# Add the stack pointer address to the offset.
add $t0 $t0 $sp
# Compute rhs for assignment =
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t2 4
# Add the stack pointer address to the offset.
add $t2 $t2 $sp
# Load the value of i.
lw $t1 0($t2)
li $t2 1
add $t1 $t1 $t2
# complete assignment statement with store
sw $t1 0($t0)
# Exiting scope.
addi $sp $sp 20
j datalabel0
datalabel1:
# Get sum's offset from $sp from the symbol table and initialize sum's address with it. We'll add $sp later.
li $t1 -20
# Add the stack pointer address to the offset.
add $t1 $t1 $sp
# Load the value of sum.
lw $t0 0($t1)
sw $t0 -12($sp)
jr $ra
# Exiting scope.
addi $sp $sp 0
jr $ra

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
la $a0 datalabel2
li $v0 4
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
datalabel3:
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t1 -44
# Add the stack pointer address to the offset.
add $t1 $t1 $sp
# Load the value of i.
lw $t0 0($t1)
li $t1 10
slt $t0 $t0 $t1
subi $t0 $t0 1
bne $t0 $zero datalabel4
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
j datalabel3
datalabel4:
# println
# Calling function sum
# Save $ra to a register
move $t0 $ra
# Save $t0-9 registers
sw $t0 -48($sp)
# Evaluate parameters and save to stack
# Get a's offset from $sp from the symbol table and initialize a's address with it. We'll add $sp later.
li $t2 -40
# Add the stack pointer address to the offset.
add $t2 $t2 $sp
# Put the address of the array into the register.
# Use the address of a.
move $t1 $t2
sw $t1 -52($sp)
li $t1 4
sw $t1 -56($sp)
# Update the stack pointer
add $sp $sp -48
# Call the function
jal sum
# Restore the stack pointer
add $sp $sp 48
# Restore $t0-9 registers
lw $t0 -48($sp)
# Restore $ra
move $ra $t0
# Get return value off stack
lw $t0 -60($sp)
move $a0 $t0
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
# println
# Calling function sum
# Save $ra to a register
move $t0 $ra
# Save $t0-9 registers
sw $t0 -48($sp)
# Evaluate parameters and save to stack
# Get a's offset from $sp from the symbol table and initialize a's address with it. We'll add $sp later.
li $t2 -40
# Add the stack pointer address to the offset.
add $t2 $t2 $sp
# Put the address of the array into the register.
# Use the address of a.
move $t1 $t2
sw $t1 -52($sp)
li $t1 8
sw $t1 -56($sp)
# Update the stack pointer
add $sp $sp -48
# Call the function
jal sum
# Restore the stack pointer
add $sp $sp 48
# Restore $t0-9 registers
lw $t0 -48($sp)
# Restore $ra
move $ra $t0
# Get return value off stack
lw $t0 -60($sp)
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
datalabel2:	.asciiz	"This should print 6 and 28"
