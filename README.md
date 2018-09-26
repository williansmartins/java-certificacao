# java-certificacao
Preparação para a prova de certificação Java

## Compilar e executar classes com pacotes
```
javac -d CertificacaoJava/classes CertificacaoJava/src/main/java/com/williansmartins/programmer1/Basico.java
```

```
java -cp CertificacaoJava/classes/ com.williansmartins.programmer1.Basico
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