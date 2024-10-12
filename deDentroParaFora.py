# Beecrowd - Problema 1235 - De Dentro para Fora
# Autor: Caio Vinicius Corsini Filho

N = int(input())  # Input de quantidade de frases
for i in range(N):  # Vai iterar o número de vezes que o usuário especificou
    linha_atual = input()  # Digita a String defeituosa
    fim = len(linha_atual)-1
    
    # Pega o meio da string original. Adaptável para tamanho par e impar. Operador ternario.
    meio = fim // 2 if fim % 2 != 0 else fim // 2 - 1
    
    consertado = ""  # Variável para armazenar a linha consertada
    consertado += linha_atual[meio]  # Começa pela letra do meio

    # Loop de trás para frente
    # Vai incrementando a String de impressão
    # Loop eh interrompido quando volto para o meio
    j = meio-1
    while j != meio:
        if j == -1:  # Quando o ponteiro chega à primeira letra da String, dá a volta para a letra final.
            j = fim
        consertado += linha_atual[j]
        j -= 1
    print(consertado)  # Imprime o resultado

"""
1. Em Python, para fazer divisao inteira, deve-se usar "//" ao invés de "/", diferente do C e do Java.
"""
