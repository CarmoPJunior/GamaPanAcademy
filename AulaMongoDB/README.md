# Atividade MongoDB

# Objetivo da Atividade:

Criar um banco de dados novo (database) e uma coleção com um nome pertinente, de acordo com os dados e tema que você escolher.

# Requisitos:

- Inserção de documentos;
- Atualização de documentos;
- Exclusão de documentos;
- Consulta com projeção;
- Consulta utilizando combinação entre os seletores;
- Consulta paginada e ordenada (utilizar ignorar , limitar e classificar );


# Comandos Utilizados:

## Criação do banco de dados:

use ExercicioGAmaPan

## Criação da Collection:

db.createCollection('Usuarios')

## Inserir os Dados:

db.usuarios.insert( { nome: "João", idade: 37,  status: "ativo", hobbie: "musica"} )
db.usuarios.insert( { nome: "Pedro", idade: 20,  status: "ativo", hobbie: "livros"} )
db.usuarios.insert( { nome: "Bianca", idade: 22,  status: "ativo", hobbie: "futebol"} )
db.usuarios.insert( { nome: "Caio", idade: 31,  status: "ativo", hobbie: "series"} )
db.usuarios.insert( { nome: "Sara", idade: 35,  status: "ativo", hobbie: "tv"}  )
db.usuarios.insert( { nome: "Juliana", idade: 32,  status: "ativo", hobbie: "musica"} )
db.usuarios.insert( { nome: "Lúcia", idade: 43,  status: "ativo", hobbie: "futebol"} )
db.usuarios.insert( { nome: "André", idade: 25,  status: "ativo", hobbie: "musica"} )

## Atualiza uma informação:

db.getCollection('Usuarios').update(
    // query 
    {
        "nome" : "Bianca"
    },
    
    // update 
    {
        $set:{
            "hobbie": "livro"
            }
    },
    
    // options 
    {
        "multi" : false,  // update only one document 
        "upsert" : false  // insert a new document, if no existing document match the query 
    }
);


db.getCollection('Usuarios').update(
    // query 
    {
        "nome" : "Caio"
    },
    
    // update 
    {
        $set:{
            "status": "inativo"
            }
    },
    
    // options 
    {
        "multi" : false,  // update only one document 
        "upsert" : false  // insert a new document, if no existing document match the query 
    }
);

## Remove uma informação:
db.getCollection('Usuarios').remove({ 'nome' : 'Sara' });


## Consulta com Projeção:

db.getCollection('Usuarios').find({},{nome: 1, hobbie: 1, _id: 0})

db.getCollection('Usuarios').find({},{nome: 1, idade: 1, _id: 0})


## Consulta Utilizando like:

db.getCollection('Usuarios').find({nome: /.*Pedro.*/})

## Consulta Utilizando o operador GreatThanEquals:

db.getCollection('Usuarios').find({idade: {$gte:30}})

## Consulta Utilizando os operadores "GreatThanEquals" e "And": 

db.getCollection('Usuarios').find({idade: {$gte:30}, status: /inativo/})

db.getCollection('Usuarios').find({idade: {$gte:30}, status: /ativo/})

## Consulta Utilizando "Limit":

db.getCollection('Usuarios').find({}).limit(2)

## Consulta Utilizando "Skip":
db.getCollection('Usuarios').find().skip(3)

## Consulta Utilizando "Sort":

db.getCollection('Usuarios').find().sort({"nome": 1})

db.getCollection('Usuarios').find().sort({"idade": -1})

