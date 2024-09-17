package net.shyshkin.study.kotlin.functions

//inline function will be generated directly into the byte-code in the place where it is called
// in this particular example there is no benefit from making function inline
// Inlining works best for functions with parameters of functional types
inline fun labelMultiplyInlined(operand1: Int,
                            operand2: Int,
                            label: String = "The answer is:") = "$label ${operand1 * operand2}"
