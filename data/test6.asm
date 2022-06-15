# All program code is placed after the
# .text assembler directive
.text

# Declare main as a global function
.globl	main

j main




add: 
addi $sp $sp 0
#Entering new scope 
# Variables: 
li $t0 -4
add $t0 $t0 $sp
lw $t1 0($t0)
li $t0 -8
add $t0 $t0 $sp
lw $t2 0($t0)
add $t1 $t1 $t2
move $a0 $t1
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
# Exiting scope
addi $sp $sp 0
jr $ra




main: 
addi $sp $sp 0
#Entering new scope 
# Variables: 
la $a0 datalabel0
li $v0 4
syscall
la $a0 newline
li $v0 4
syscall
move $t0 $ra
sw $t0 -12($sp)
# Param Eval:
li $t1, 3
sw $t1 -16($sp)
li $t1, 4
sw $t1 -20($sp)
addi $sp $sp -12
jal add 
addi $sp $sp 12
lw $t0 -12($sp)
move $ra $t0 
li $t0 -4
add $t0 $t0 $sp
li $t1, 5
sw $t1 0($t0)
li $t0 -8
add $t0 $t0 $sp
li $t1, 2
sw $t1 0($t0)
move $t0 $ra
sw $t0 -12($sp)
# Param Eval:
li $t1 -4
add $t1 $t1 $sp
lw $t2 0($t1)
sw $t2 -16($sp)
li $t1 -8
add $t1 $t1 $sp
lw $t2 0($t1)
sw $t2 -20($sp)
addi $sp $sp -12
jal add 
addi $sp $sp 12
lw $t0 -12($sp)
move $ra $t0 
# Exiting scope
addi $sp $sp 0
li $v0 10
syscall

# All memory structures are placed after the
# .data assembler directive
.data

newline: .asciiz	"\n"
datalabel0: .asciiz "This program prints 7 7"
