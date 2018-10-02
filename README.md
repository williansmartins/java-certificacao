# java-certificacao
Preparação para a prova de certificação Java

## Compilar e executar classes com pacotes
(tem que estar na raiz do projeto: java-certificacao/)

```
//criar diretorio para jogas os bitecodes
mkdir CertificacaoJava/target
//compilar
javac -d CertificacaoJava/target CertificacaoJava/src/main/java/com/williansmartins/programmer1/a/Basico1.java
//executar
java -cp CertificacaoJava/target com.williansmartins.programmer1.a.Basico1
```

## Empacotar e executar aplicação em um JAR
from: /c/dev/projetos/pwms/java-certificacao/CertificacaoJava/classes
```
jar -cf pacote.jar com/williansmartins/*
```

```
 java -cp pacote.jar com.williansmartins.programmer1.Basico
```

## Criar jar com manifesto (para definir classe principal)
compilar:
```
javac -d . ../src/main/java/com/williansmartins/programmer1/Basico1.java
```

gerar jar
```
jar cvfe pacote6.jar com.williansmartins.programmer1.Basico1 com/williansmartins/*
```

executar jar
```
java -jar pacote6.jar
```
