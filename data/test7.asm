# All program code is placed after the
# .text assembler directive
.text

# Declare main as a global function
.globl	main

j main




identity: 
addi $sp $sp 0
#Entering new scope 
# Variables: 
li $t0 -4
add $t0 $t0 $sp
lw $t1 0($t0)
sw $t1 -8($sp)
jr $ra
# Exiting scope
addi $sp $sp 0
jr $ra




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
sw $t1 -12($sp)
jr $ra
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
sw $t0 -4($sp)
# Param Eval:
li $t1, 7
sw $t1 -8($sp)
addi $sp $sp -4
jal identity 
addi $sp $sp 4
lw $t0 -4($sp)
move $ra $t0 
#checking return value 
lw $t0 -12($sp)
move $a0 $t0
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
move $t0 $ra
sw $t0 -4($sp)
# Param Eval:
li $t1, 3
sw $t1 -8($sp)
li $t1, 4
sw $t1 -12($sp)
addi $sp $sp -4
jal add 
addi $sp $sp 4
lw $t0 -4($sp)
move $ra $t0 
#checking return value 
lw $t0 -16($sp)
move $a0 $t0
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
# Exiting scope
addi $sp $sp 0
li $v0 10
syscall

# All memory structures are placed after the
# .data assembler directive
.data

newline: .asciiz	"\n"
datalabel0: .asciiz "This program prints 7 7"
