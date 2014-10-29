package tools;
import tools.Identificador;
import static tools.Identificador.*;
%%
%class Lexico
%type Identificador
%line

comilla= ["a-zA-Z"]
entero= [0-9]
exponente=["x10""X10"eE]
flotante={entero}[\.]{entero}+{exponente}[0-9]+
variables=[a-zA-Z]+[0-9]*
//Espacio=[ \t\r\n]
and=[a][n][d]|[A][N][D]
or=[o][r]|[O][R]
entradaC = [^\r\n]
finL = [\r|\n|\r\n]
comentarioA = "/*" [^*] ~"*/" | "/*" "*"+ "/"
comentarioB = "//" {entradaC}*{finL}?
nomClase = [A-Z]+{variables}

%{
    public String clasif;
    public boolean estado=true;
    public int errorLinea;
%}

%%
"clase" {clasif=yytext(); return RESERVADA;}
"propiedades" {clasif=yytext(); return RESERVADA;} 
{nomClase} {clasif=yytext(); return ID;}

    /*RESERVADAS*/
    "boleano" {clasif=yytext(); return RESERVADA;}
    "cadena" {clasif=yytext(); return RESERVADA;}
    "entero" {clasif=yytext(); return RESERVADA;}
    "decimal" {clasif=yytext(); return RESERVADA;}
    "metodos" {clasif=yytext(); return RESERVADA;}   

"\""       {clasif=yytext(); return ESPECIALES;}

{flotante}      {clasif=yytext(); return NUMERO;}
{entero}+       {clasif=yytext(); return NUMERO;}

/*Palabras Reservadas*/
{and}           {clasif=yytext(); return RESERVADA;}
"clase"         {clasif=yytext(); return RESERVADA;}
"desde"         {clasif=yytext(); return RESERVADA;}
"devolver"      {clasif=yytext(); return RESERVADA;}
"entonces"      {clasif=yytext(); return RESERVADA;}
"escribir"      {clasif=yytext(); return RESERVADA;}
"extiende"      {clasif=yytext(); return RESERVADA;}
"falso"         {clasif=yytext(); return RESERVADA;}
"hacer"         {clasif=yytext(); return RESERVADA;}
"incrementar"   {clasif=yytext(); return RESERVADA;}
"leer"          {clasif=yytext(); return RESERVADA;}
"mientras"      {clasif=yytext(); return RESERVADA;}
"NULO"|"nulo"   {clasif=yytext(); return RESERVADA;}
"sino"          {clasif=yytext(); return RESERVADA;}
"si"            {clasif=yytext(); return RESERVADA;}
"retornar"      {clasif=yytext(); return RESERVADA;}
{or}            {clasif=yytext(); return RESERVADA;}
"verdadero"     {clasif=yytext(); return RESERVADA;}


/*IDENTIFICADORES*/
{variables}+       {clasif=yytext(); return ID;}

/*OPERADORES*/
"++"            {clasif=yytext(); return OPERADOR;}
"+"             {clasif=yytext(); return OPERADOR;}
"--"            {clasif=yytext(); return OPERADOR;}
"-"             {clasif=yytext(); return OPERADOR;} 
"*"             {clasif=yytext(); return OPERADOR;}
"%"             {clasif=yytext(); return OPERADOR;}
"=="            {clasif=yytext(); return OPERADOR;}
"="             {clasif=yytext(); return OPERADOR;}
"/"             {clasif=yytext(); return OPERADOR;}
">"             {clasif=yytext(); return OPERADOR;}
"<"             {clasif=yytext(); return OPERADOR;}
"!="            {clasif=yytext(); return OPERADOR;}
"|"             {clasif=yytext(); return OPERADOR;}

/*ESPECIALES*/
";"             {clasif=yytext(); return FNLINEA;}
"."             {clasif=yytext(); return ESPECIALES;}
"("             {clasif=yytext(); return ESPECIALES;}
")"             {clasif=yytext(); return ESPECIALES;}
","             {clasif=yytext(); return ESPECIALES;}
"["             {clasif=yytext(); return ESPECIALES;}
"]"             {clasif=yytext(); return ESPECIALES;}

/*COMENTARIOS*/
({comentarioB})+ {clasif=yytext(); return COMENTARIOS;}
({comentarioA})+ {clasif=yytext(); return COMENTARIOS;}

/*ESPACIOS*/
    ("  ") {clasif=yytext(); return DOSESPACIOS;}
    (" ") {clasif=yytext(); return UNESPACIO;}
    


/*FIN DE LINEA*/

[\r\n\f] {}
. {yyclose(); return ERROR;}
