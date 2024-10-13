**Inteiro** *N* <- lerDoUsuario  
Para cada *N*:  
&nbsp;&nbsp;&nbsp;&nbsp; **String** *linhaAtual* <- lerDoUsuario  
&nbsp;&nbsp;&nbsp;&nbsp; **Inteiro** *fim* <- comprimentoDa(*linhaAtual*) - 1  
&nbsp;&nbsp;&nbsp;&nbsp; **Inteiro** *meio*  
&nbsp;&nbsp;&nbsp;&nbsp; Se comprimentoDa(*linhaAtual*) é impar:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; *meio* = *fim* / 2  
&nbsp;&nbsp;&nbsp;&nbsp; Senão:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; *meio* = *fim* / 2 - 1  
&nbsp;&nbsp;&nbsp;&nbsp; **String** *consertado*  
&nbsp;&nbsp;&nbsp;&nbsp; limpar(*consertado*)  
&nbsp;&nbsp;&nbsp;&nbsp; *consertado*.inserirLetraNaPosicao[*meio*]  
&nbsp;&nbsp;&nbsp;&nbsp; **Inteiro** *j* <- 0  
&nbsp;&nbsp;&nbsp;&nbsp; Enquanto *j* não for *meio*:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Se *j* for -1:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; *j* <- *fim*  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; *consertado*.inserirLetraNaPosicao[*j*]  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; *j* <- *j*-1  
&nbsp;&nbsp;&nbsp;&nbsp; Imprimir(*consertado*)  
