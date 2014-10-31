package tools;
import java_cup.runtime.Symbol;
%%
%class Lexico
%line
%cup

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

%eofval{
  System.out.println("Fin de archivo encontrado");
  return new Symbol(sym.EOF);
%eofval}
%eofclose

%%
"clase" {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
"propiedades" {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));} 
{nomClase} {return new Symbol(sym.ID, new token(yyline, yytext()));}

    /*RESERVADAS*/
    "boleano" {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
    "cadena" {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
    "entero" {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
    "decimal" {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
    "metodos" {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}   



{flotante}      {return new Symbol(sym.NUMERO, new token(yyline, yytext()));}
{entero}+       {return new Symbol(sym.NUMERO, new token(yyline, yytext()));}

/*Palabras Reservadas*/
{and}           {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
"clase"         {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
"desde"         {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
"devolver"      {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
"entonces"      {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
"escribir"      {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
"extiende"      {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
"falso"         {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
"hacer"         {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
"incrementar"   {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
"leer"          {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
"mientras"      {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
"NULO"|"nulo"   {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
"sino"          {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
"si"            {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
"retornar"      {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
{or}            {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}
"verdadero"     {return new Symbol(sym.RESERVADA, new token(yyline, yytext()));}


/*IDENTIFICADORES*/
{variables}+       {return new Symbol(sym.ID, new token(yyline, yytext()));}

/*OPERADORES*/
"++"            {return new Symbol(sym.OPERADOR, new token(yyline, yytext()));}
"+"             {return new Symbol(sym.OPERADOR, new token(yyline, yytext()));}
"--"            {return new Symbol(sym.OPERADOR, new token(yyline, yytext()));}
"-"             {return new Symbol(sym.OPERADOR, new token(yyline, yytext()));}
"*"             {return new Symbol(sym.OPERADOR, new token(yyline, yytext()));}
"%"             {return new Symbol(sym.OPERADOR, new token(yyline, yytext()));}
"=="            {return new Symbol(sym.OPERADOR, new token(yyline, yytext()));}
"="             {return new Symbol(sym.OPERADOR, new token(yyline, yytext()));}
"/"             {return new Symbol(sym.OPERADOR, new token(yyline, yytext()));}
">"             {return new Symbol(sym.OPERADOR, new token(yyline, yytext()));}
"<"             {return new Symbol(sym.OPERADOR, new token(yyline, yytext()));}
"!="            {return new Symbol(sym.OPERADOR, new token(yyline, yytext()));}
"|"             {return new Symbol(sym.OPERADOR, new token(yyline, yytext()));}

/*ESPECIALES*/
";"             {return new Symbol(sym.FNLINEA, new token(yyline, yytext()));}
"."             {return new Symbol(sym.ESPECIALES, new token(yyline, yytext()));}
"("             {return new Symbol(sym.ESPECIALES, new token(yyline, yytext()));}
")"             {return new Symbol(sym.ESPECIALES, new token(yyline, yytext()));}
","             {return new Symbol(sym.ESPECIALES, new token(yyline, yytext()));}
"["             {return new Symbol(sym.ESPECIALES, new token(yyline, yytext()));}
"]"             {return new Symbol(sym.ESPECIALES, new token(yyline, yytext()));}

/*COMENTARIOS*/
({comentarioB})+ {return new Symbol(sym.COMENTARIOS, new token(yyline, yytext()));}
({comentarioA})+ {return new Symbol(sym.COMENTARIOS, new token(yyline, yytext()));}

/*ESPACIOS*/
    ("  ") {return new Symbol(sym.DOSESPACIOS, new token(yyline, yytext()));}
    (" ") {return new Symbol(sym.UNESPACIO, new token(yyline, yytext()));}
    


/*FIN DE LINEA*/

[\r\n\f] {}
. {yyclose(); 
    System.err.println("Caracter Invalido" + yytext() + "["+ yyline + "]");
    return new Symbol(sym.ERROR);}