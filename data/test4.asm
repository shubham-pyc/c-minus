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
la $a0 datalabel0
li $v0 4
syscall
la $a0 newline
li $v0 4
syscall
li $t0 -4
add $t0 $t0 $sp
li $t1, 3
sw $t1 0($t0)
li $t0 -8
add $t0 $t0 $sp
li $t1, 2
sw $t1 0($t0)
addi $sp $sp -8
#Entering new scope 
# Variables: 
li $t0 -4
add $t0 $t0 $sp
li $t1, 5
sw $t1 0($t0)
li $t0 -4
add $t0 $t0 $sp
lw $t1 0($t0)
li $t0 0
add $t0 $t0 $sp
lw $t2 0($t0)
add $t1 $t1 $t2
move $a0 $t1
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
addi $sp $sp -4
#Entering new scope 
# Variables: 
li $t0 -4
add $t0 $t0 $sp
li $t1, 9
sw $t1 0($t0)
li $t0 0
add $t0 $t0 $sp
li $t1, 2
sub $t1, $zero, $t1
sw $t1 0($t0)
li $t0 0
add $t0 $t0 $sp
lw $t1 0($t0)
li $t0 -4
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
addi $sp $sp 4
li $t0 0
add $t0 $t0 $sp
li $t1, 4
sw $t1 0($t0)
# Exiting scope
addi $sp $sp 8
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
li $v0 10
syscall

# All memory structures are placed after the
# .data assembler directive
.data

newline: .asciiz	"\n"
datalabel0: .asciiz "This program prints 7 7 7"
