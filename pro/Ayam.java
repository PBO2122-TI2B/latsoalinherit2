����   4 H
      hierarki/Unggas <init> ()V	  	 
   hierarki/Ayam 	jenisKaki Ljava/lang/String;	     	warnaBulu	     jengger	      java/lang/System out Ljava/io/PrintStream;  $Ayam mencari makanan dengan mengais 
       java/io/PrintStream println (Ljava/lang/String;)V " .Ayam dapat berkokok dan berbunyi 'kukuruyuk'!  $ 
===AYAM===
  & '  info
  ) *  mengais
  , -  berkokok / java/lang/StringBuilder
 .  2 Jenis kaki      : 
 . 4 5 6 append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 . 8 9 : toString ()Ljava/lang/String; < Warna Bulu      :  > Memiliki jengger?  9(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V Code LineNumberTable LocalVariableTable this Lhierarki/Ayam; MethodParameters 
SourceFile 	Ayam.java !                        ?  @   l     *� *+� *,� *-� �    A          	      B   *     C D                     E              *   @   7     	� � �    A   
       B       	 C D    -   @   7     	� !� �    A   
       B       	 C D    '   @   �     i� #� *� %*� (*� +� � .Y� 01� 3*� � 3� 7� � � .Y� 0;� 3*� � 3� 7� � � .Y� 0=� 3*� � 3� 7� �    A   "    !  "  #  $  % 0 & L ' h ( B       i C D    F    G