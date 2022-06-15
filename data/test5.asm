# All program code is placed after the
# .text assembler directive
.text

# Declare main as a global function
.globl	main

j main




foo: 
addi $sp $sp 0
#Entering new scope 
# Variables: 
li $t0, 7
move $a0 $t0
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
# Exiting scope
addi $sp $sp 0
jr $ra




fum: 
addi $sp $sp 0
#Entering new scope 
# Variables: 
li $t0 -4
add $t0 $t0 $sp
li $t1, 9
sw $t1 0($t0)
li $t0 -8
add $t0 $t0 $sp
li $t1, 12
sw $t1 0($t0)
li $t0 -8
add $t0 $t0 $sp
lw $t1 0($t0)
li $t0 -4
add $t0 $t0 $sp
lw $t2 0($t0)
sub $t1 $t1 $t2
li $t0, 4
add $t1 $t1 $t0
move $a0 $t1
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
move $t0 $ra
sw $t0 -12($sp)
# Param Eval:
addi $sp $sp -12
jal foo 
addi $sp $sp 12
lw $t0 -12($sp)
move $ra $t0 
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
addi $sp $sp -4
jal foo 
addi $sp $sp 4
lw $t0 -4($sp)
move $ra $t0 
move $t0 $ra
sw $t0 -4($sp)
# Param Eval:
addi $sp $sp -4
jal fum 
addi $sp $sp 4
lw $t0 -4($sp)
move $ra $t0 
# Exiting scope
addi $sp $sp 0
li $v0 10
syscall

# All memory structures are placed after the
# .data assembler directive
.data

newline: .asciiz	"\n"
datalabel0: .asciiz "This program prints 7 7 7"
