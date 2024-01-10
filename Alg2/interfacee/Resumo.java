package interfacee;

public class Resumo {
/*
 Uma interface é utilizada para difinir o comportamento de uma classe
  - ela estabelece um "contrato" a ser seguido pela classe
 
 A classe, que implementa uma interface, deve disponibilizar(obrigatoriamente) todo o comportamento definido pela interface
 - visualiza somente o que for desejavel
 
 -- possui seus metodos abstratos
 
 -- herança herda a interface possui contratos
 -- se ela é um, e um classe nao pode herda a outra so a classe Pai pode herda as duas
 
 -- todo metodo a principio é abstrato - todo metodo sem corpo é abstrato
 
 -- TIPO DE METODO: uma interface pode conter metodos default e static(static é somente daquela interface)
 
 -- TIPO DE ATRIBUTOS: em uma interface pode existir apenas atributos do tipo static e final (Todas as variaveis são do tipo final(é uma constante)(mesmo não utilizando keyward final)
 
 -- Não existe objeto em interface
 
QUANDO USAR:

 CLASSES ABSTRATAS:
-Necessidade de compartilhamento de codigo comum entre classes;
 --Atributos e Metodos;
 --Metodos abstrtos e nao abstratos
 --Atributos estaticos e nao estaticos
 --modificadores de acesso variados.

INTERFACE
 - geralmente todos os recursos sao abstratos
 - uma classe pode implementar mais de uma interface
 - para definir o comportamento de um tipo de dado, porem, sem a necessidade de se preocupar com quem implementa.
 
 
 -- relacionamento de contrato que foram definidos 
 1 - ter sentido
 2 - pode ser aplicado uma interface para qualquer classe
 
 Exemplo em uml:
 
     <<interface>>														
      InterRadio                                                      Radio
 + ligar() : void             <|-----                            - estacao: float
 + desligar() : void                                             - ligado : boolean
 + mudarEstacao(valor : float) : void 
 
 
 */
}
