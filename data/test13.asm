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
li $t0 -40
add $t0 $t0 $sp
li $t1, 0
li $t2 4
mul $t1 $t1 $t2
add $t0 $t0 $t1
li $t1, 0
sw $t1 0($t0)
li $t0 -40
add $t0 $t0 $sp
li $t1, 0
li $t2 4
mul $t1 $t1 $t2
add $t0 $t0 $t1
lw $t1 0($t0)
move $a0 $t1
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
li $t0 -40
add $t0 $t0 $sp
li $t1, 2
li $t2 4
mul $t1 $t1 $t2
add $t0 $t0 $t1
li $t1, 2
sw $t1 0($t0)
li $t0 -40
add $t0 $t0 $sp
li $t1, 2
li $t2 4
mul $t1 $t1 $t2
add $t0 $t0 $t1
lw $t1 0($t0)
move $a0 $t1
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
li $t0 -44
add $t0 $t0 $sp
li $t1, 2
sw $t1 0($t0)
li $t0 -40
add $t0 $t0 $sp
li $t1 -44
add $t1 $t1 $sp
lw $t2 0($t1)
li $t1 4
mul $t2 $t2 $t1
add $t0 $t0 $t2
li $t1 -44
add $t1 $t1 $sp
lw $t2 0($t1)
sw $t2 0($t0)
li $t0 -40
add $t0 $t0 $sp
li $t1 -44
add $t1 $t1 $sp
lw $t2 0($t1)
li $t1 4
mul $t2 $t2 $t1
add $t0 $t0 $t2
lw $t1 0($t0)
move $a0 $t1
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
li $t0 -44
add $t0 $t0 $sp
li $t1, 0
sw $t1 0($t0)
datalabel1:
li $t0 -44
add $t0 $t0 $sp
lw $t1 0($t0)
li $t0, 10
slt $t1 $t1 $t0
subi $t1 $t1 1
bne $t1 $zero datalabel2
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
j datalabel1
datalabel2:
li $t0 -40
add $t0 $t0 $sp
li $t1, 3
li $t2 4
mul $t1 $t1 $t2
add $t0 $t0 $t1
lw $t1 0($t0)
move $a0 $t1
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
li $t0 -40
add $t0 $t0 $sp
li $t1, 6
li $t2 4
mul $t1 $t1 $t2
add $t0 $t0 $t1
lw $t1 0($t0)
move $a0 $t1
li $v0 1
syscall
la $a0 newline
li $v0 4
syscall
li $t0 -40
add $t0 $t0 $sp
li $t1, 6
li $t2 4
mul $t1 $t1 $t2
add $t0 $t0 $t1
lw $t1 0($t0)
li $t0, 6
mult $t1 $t0
mflo $t1
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
datalabel0: .asciiz "This should print 0, 2, 2, 3, 6 and 36"
