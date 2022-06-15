# All program code is placed after the
# .text assembler directive
.text

# Declare main as a global function
.globl	main

j main




sum: 
addi $sp $sp 0
#Entering new scope 
# Variables: 
li $t0 -12
add $t0 $t0 $sp
li $t1, 0
sw $t1 0($t0)
li $t0 -16
add $t0 $t0 $sp
li $t1, 0
sw $t1 0($t0)
datalabel1:
li $t0 -12
add $t0 $t0 $sp
lw $t1 0($t0)
li $t0 -8
add $t0 $t0 $sp
lw $t2 0($t0)
slt $t1 $t1 $t2
subi $t1 $t1 1
bne $t1 $zero datalabel2
addi $sp $sp -16
#Entering new scope 
# Variables: 
li $t0 0
add $t0 $t0 $sp
li $t1 0
add $t1 $t1 $sp
lw $t2 0($t1)
li $t1 12
add $t1 $t1 $sp
lw $t1 0($t1)
li $t3 4
add $t3 $t3 $sp
lw $t4 0($t3)
li $t3 4
mul $t4 $t4 $t3
add $t1 $t1 $t4
lw $t3 0($t1)
add $t2 $t2 $t3
sw $t2 0($t0)
li $t0 4
add $t0 $t0 $sp
li $t1 4
add $t1 $t1 $sp
lw $t2 0($t1)
li $t1, 1
add $t2 $t2 $t1
sw $t2 0($t0)
# Exiting scope
addi $sp $sp 16
j datalabel1
datalabel2:
li $t0 -16
add $t0 $t0 $sp
lw $t1 0($t0)
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
li $t0 -44
add $t0 $t0 $sp
li $t1, 0
sw $t1 0($t0)
datalabel3:
li $t0 -44
add $t0 $t0 $sp
lw $t1 0($t0)
li $t0, 10
slt $t1 $t1 $t0
subi $t1 $t1 1
bne $t1 $zero datalabel4
addi $sp $sp -44
#Entering new scope 
# Variables: 
li $t0 4
add $t0 $t0 $sp
li $t1 0
add $t1 $t1 $sp
lw $t2 0($t1)
li $t1 4
mul $t2 $t2 $t1
add $t0 $t0 $t2
li $t1 0
add $t1 $t1 $sp
lw $t2 0($t1)
sw $t2 0($t0)
li $t0 0
add $t0 $t0 $sp
li $t1 0
add $t1 $t1 $sp
lw $t2 0($t1)
li $t1, 1
add $t2 $t2 $t1
sw $t2 0($t0)
# Exiting scope
addi $sp $sp 44
j datalabel3
datalabel4:
move $t0 $ra
sw $t0 -48($sp)
# Param Eval:
li $t1 -40
add $t1 $t1 $sp
sw $t1 -52($sp)
li $t1, 4
sw $t1 -56($sp)
addi $sp $sp -48
jal sum 
addi $sp $sp 48
lw $t0 -48($sp)
move $ra $t0 
#checking return value 
lw $t0 -60($sp)
move $a0 $t0
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
move $t0 $ra
sw $t0 -48($sp)
# Param Eval:
li $t1 -40
add $t1 $t1 $sp
sw $t1 -52($sp)
li $t1, 8
sw $t1 -56($sp)
addi $sp $sp -48
jal sum 
addi $sp $sp 48
lw $t0 -48($sp)
move $ra $t0 
#checking return value 
lw $t0 -60($sp)
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
datalabel0: .asciiz "This should print 6 and 28"
