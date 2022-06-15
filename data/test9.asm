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
li $t1, 3
sw $t1 0($t0)
la $a0 datalabel0
li $v0 4
syscall
la $a0 newline
li $v0 4
syscall
li $t0 -4
add $t0 $t0 $sp
lw $t1 0($t0)
li $t0, 4
slt $t1 $t1 $t0
subi $t1 $t1 1
bne $t1 $zero datalabel9
addi $sp $sp -4
#Entering new scope 
# Variables: 
la $a0 datalabel1
li $v0 4
syscall
la $a0 newline
li $v0 4
syscall
# Exiting scope
addi $sp $sp 4
j datalabel10
datalabel9:
datalabel10:
li $t0 -4
add $t0 $t0 $sp
lw $t1 0($t0)
li $t0, 4
slt $t1 $t0 $t1
subi $t1 $t1 1
bne $t1 $zero datalabel11
addi $sp $sp -4
#Entering new scope 
# Variables: 
la $a0 datalabel2
li $v0 4
syscall
la $a0 newline
li $v0 4
syscall
# Exiting scope
addi $sp $sp 4
j datalabel12
datalabel11:
datalabel12:
li $t0 -4
add $t0 $t0 $sp
lw $t1 0($t0)
li $t0, 4
slt $t1 $t0 $t1
subi $t1 $t1 1
bne $t1 $zero datalabel13
addi $sp $sp -4
#Entering new scope 
# Variables: 
la $a0 datalabel3
li $v0 4
syscall
la $a0 newline
li $v0 4
syscall
# Exiting scope
addi $sp $sp 4
j datalabel14
datalabel13:
addi $sp $sp -4
#Entering new scope 
# Variables: 
la $a0 datalabel4
li $v0 4
syscall
la $a0 newline
li $v0 4
syscall
# Exiting scope
addi $sp $sp 4
datalabel14:
li $t0 -4
add $t0 $t0 $sp
lw $t1 0($t0)
li $t0, 3
slt $t1 $t1 $t0
bne $t1 $zero datalabel15
addi $sp $sp -4
#Entering new scope 
# Variables: 
la $a0 datalabel5
li $v0 4
syscall
la $a0 newline
li $v0 4
syscall
# Exiting scope
addi $sp $sp 4
j datalabel16
datalabel15:
datalabel16:
li $t0 -4
add $t0 $t0 $sp
lw $t1 0($t0)
li $t0, 3
sub $t1 $t1 $t0
bne $t1 $zero datalabel17
addi $sp $sp -4
#Entering new scope 
# Variables: 
la $a0 datalabel6
li $v0 4
syscall
la $a0 newline
li $v0 4
syscall
# Exiting scope
addi $sp $sp 4
j datalabel18
datalabel17:
datalabel18:
li $t0 -4
add $t0 $t0 $sp
lw $t1 0($t0)
li $t0, 4
slt $t1 $t1 $t0
bne $t1 $zero datalabel19
addi $sp $sp -4
#Entering new scope 
# Variables: 
la $a0 datalabel7
li $v0 4
syscall
la $a0 newline
li $v0 4
syscall
# Exiting scope
addi $sp $sp 4
j datalabel20
datalabel19:
addi $sp $sp -4
#Entering new scope 
# Variables: 
la $a0 datalabel8
li $v0 4
syscall
la $a0 newline
li $v0 4
syscall
# Exiting scope
addi $sp $sp 4
datalabel20:
# Exiting scope
addi $sp $sp 0
li $v0 10
syscall

# All memory structures are placed after the
# .data assembler directive
.data

newline: .asciiz	"\n"
datalabel0: .asciiz "This program prints [1..5] correct."
datalabel1: .asciiz "1 correct"
datalabel2: .asciiz "2 not correct"
datalabel3: .asciiz "2 not correct"
datalabel4: .asciiz "2 correct"
datalabel5: .asciiz "3 correct"
datalabel6: .asciiz "4 correct"
datalabel7: .asciiz "5 not correct"
datalabel8: .asciiz "5 correct"
