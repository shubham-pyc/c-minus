# All program code is placed after the
# .text assembler directive
.text

# Declare main as a global function
.globl	main

j main




main: 
addi $sp $sp 0
#Entering new scope 
# Variables: 
li $t0 -4
add $t0 $t0 $sp
li $t1, 0
sw $t1 0($t0)
la $a0 datalabel0
li $v0 4
syscall
la $a0 newline
li $v0 4
syscall
datalabel1:
li $t0 -4
add $t0 $t0 $sp
lw $t1 0($t0)
li $t0, 10
slt $t1 $t1 $t0
subi $t1 $t1 1
bne $t1 $zero datalabel2
addi $sp $sp -4
#Entering new scope 
# Variables: 
li $t0 0
add $t0 $t0 $sp
lw $t1 0($t0)
move $a0 $t1
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
li $t0 0
add $t0 $t0 $sp
li $t1 0
add $t1 $t1 $sp
lw $t2 0($t1)
li $t1, 1
add $t2 $t2 $t1
sw $t2 0($t0)
# Exiting scope
addi $sp $sp 4
j datalabel1
datalabel2:
# Exiting scope
addi $sp $sp 0
li $v0 10
syscall

# All memory structures are placed after the
# .data assembler directive
.data

newline: .asciiz	"\n"
datalabel0: .asciiz "This program prints 0 through 9."
