# All program code is placed after the
# .text assembler directive
.text

# Declare main as a global function
.globl	main

j main




fib: 
addi $sp $sp 0
#Entering new scope 
# Variables: 
li $t0 -4
add $t0 $t0 $sp
lw $t1 0($t0)
li $t0, 0
sub $t1 $t1 $t0
bne $t1 $zero datalabel1
li $t0, 1
sw $t0 -8($sp)
jr $ra
j datalabel2
datalabel1:
datalabel2:
li $t0 -4
add $t0 $t0 $sp
lw $t1 0($t0)
li $t0, 1
sub $t1 $t1 $t0
bne $t1 $zero datalabel3
li $t0, 1
sw $t0 -8($sp)
jr $ra
j datalabel4
datalabel3:
datalabel4:
move $t0 $ra
sw $t0 -8($sp)
# Param Eval:
li $t1 -4
add $t1 $t1 $sp
lw $t2 0($t1)
li $t1, 1
sub $t2 $t2 $t1
sw $t2 -12($sp)
addi $sp $sp -8
jal fib 
addi $sp $sp 8
lw $t0 -8($sp)
move $ra $t0 
#checking return value 
lw $t0 -16($sp)
move $t1 $ra
sw $t0 -8($sp)
sw $t1 -12($sp)
# Param Eval:
li $t2 -4
add $t2 $t2 $sp
lw $t3 0($t2)
li $t2, 2
sub $t3 $t3 $t2
sw $t3 -16($sp)
addi $sp $sp -12
jal fib 
addi $sp $sp 12
lw $t0 -8($sp)
lw $t1 -12($sp)
move $ra $t1 
#checking return value 
lw $t1 -20($sp)
add $t0 $t0 $t1
sw $t0 -8($sp)
jr $ra
# Exiting scope
addi $sp $sp 0
jr $ra




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
datalabel5:
li $t0 -4
add $t0 $t0 $sp
lw $t1 0($t0)
li $t0, 12
slt $t1 $t1 $t0
subi $t1 $t1 1
bne $t1 $zero datalabel6
addi $sp $sp -4
#Entering new scope 
# Variables: 
move $t0 $ra
sw $t0 -4($sp)
# Param Eval:
li $t1 0
add $t1 $t1 $sp
lw $t2 0($t1)
sw $t2 -8($sp)
addi $sp $sp -4
jal fib 
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
j datalabel5
datalabel6:
# Exiting scope
addi $sp $sp 0
li $v0 10
syscall

# All memory structures are placed after the
# .data assembler directive
.data

newline: .asciiz	"\n"
datalabel0: .asciiz "This program prints the first 12 numbers of the Fibonacci sequence."
