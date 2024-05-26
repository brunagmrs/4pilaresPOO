# Pilares da POO

## Abstração
Concentrar informações necessárias do objeto. Na classe Objeto podemos incluir vários atributos, mas o ideal é definirmos os atributos que fazem sentido, abstraindo os atributos necessários para a classe.

Exemplo: O objeto Pessoa tem vários atributos:

    cor da pele, cor do olho, nome, cpf, endereço, escolaridade, altura, idade.

Mas no banco de dados só queremos a informações:

    nome, cpf e idade. 
Os atributos restantes não farão tanta diferença no banco, logo não precisamos guardá-los.

#### Classe Abstrata
Uma classe que é genérica, como Animal, Pessoa, etc.

Classes abstratas não podem ser instânciadas, elas geralmente são utilizadas como pai de outra classe (filho)

    
<sub>animal.java</sub>

    public abstract class Animal{

    }

#### Métodos Abstratos 
    
Métodos podem ser abstratos também, eles não possuem corpo na classe principal. Quando ele é sobrescrito em outra classe concreta, deve-se implementar sua funcionalidade no seu corpo.

<sub>animal.java</sub>
    
    public abstratic void Andar;


<sub>ave.java</sub>

    public class Ave extends Animal{
        public void Andar(){
            System.out.println("O animal está andando");
        }
    }

<br>

A classe ave herda os atributos da classe animal, como é a primeira classe concreta em que o método Andar() é implementado, necessita de sua descrição em seu corpo. 

Mas as classes seguintes que herdarem os métodos e atributos da classe Animal, não descreverão o método.

## Encapsulamento
É a proteção de dados do objeto através de sua visibilidade.

Temos acesso à métodos e variáveis de acordo com sua visibilidade no código, que são:

- public: podem ser acessados através de outras classes. 

Geralmente declaramos métodos como public.

- protected: só pode ser acessado no mesmo pacote.

Por padrão os atributos já são declarados internamente como protected.

- private: só podem ser acessados dentro de sua própria classe.

Geralmente atributos são declarados como private, para promover sua segurança. Necessitando de métodos em sua classe que acessem esse atributo.

## Herança

Quando uma classe filha (subclasse) herda de uma classe mãe (superclasse) seus métodos e atributos. É muito útil para redução de código.

Exemplo: Queremos criar a classe Professor e Aluno, elas possuem métodos e atributos diferentes. Mas alguns métodos e atributos são iguais. Então podemos criar a classe Pessoa que terá esses atributos e classes mais genéricos.

    public class Pessoa {
        int cpf;
        String nome;
        String endereco;
    }

Professor e Aluno tem esses mesmos atributos, então pode herdar da classe Pessoa.

    public class Aluno extends Pessoa{
        int registroAcademico;
        int matricula;
        String turma;
    }

Os atributos declarados na classe Aluno são exclusivos de Aluno, já os genéricos que são tanto de Aluno como de Professor não precisam ser declarados novamente, pois já foram passados como herança (extends Pessoa). O mesmo acontece na classe Professor.

    public class Professor entends Pessoa{
        double salario;
        String titulacao;
    }


## Polimorfismo

Quando subclasses diferentes herdam de uma mesma superclasse. Porém na utilização dos métodos, os resultados podem ser diferentes, mesmo que o método seja herdado de uma mesma classe mãe.

Exemplo: Uma classe mãe abstrata Animal possui os seguintes métodos:

    public abstract class Animal{
        String cor;
        int peso;
        String habitat;

        public abstratic locomover();
        public abstratic comunicar();
    }

Então temos as classes Cachorro, Passaro que herdam os mesmos métodos e atributos. Porém seus métodos tem retornos diferentes.

    public class Cachorro extends Animal{
        private raca;

        public locomover(){
            return "Correr";
        }

        public comunicar(){
            return "Latir";
        }
    }

    public class Passaro extends Animal{
        boolean riscoExtinção;

        public locomover(){
            return "Voar";
        }

        public comunicar(){
            return "Piar";
        }
    }