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
# Exiting scope
addi $sp $sp 0
li $v0 10
syscall

# All memory structures are placed after the
# .data assembler directive
.data

newline: .asciiz	"\n"
datalabel0: .asciiz "Hello world"
