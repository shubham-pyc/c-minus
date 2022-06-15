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
la $a0 datalabel0
li $v0 4
syscall
la $a0 newline
li $v0 4
syscall
datalabel1:
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t1 -4
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
addi $sp $sp -4
# println
# Get i's offset from $sp from the symbol table and initialize i's address with it. We'll add $sp later.
li $t1 0
# Add the stack pointer address to the offset.
add $t1 $t1 $sp
# Load the value of i.
lw $t0 0($t1)
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
j datalabel1
datalabel2:
# Exiting scope.
addi $sp $sp 0
li $v0 10
syscall

# All memory structures are placed after the
# .data assembler directive
.data

newline:	.asciiz	"\n"
datalabel0:	.asciiz	"This program prints 0 through 9."
