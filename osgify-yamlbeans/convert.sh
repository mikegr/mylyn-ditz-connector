mkdir bin
cd bin
wget http://switch.dl.sourceforge.net/sourceforge/yamlbeans/yamlbeans-0.9.2.jar
wget http://www.aqute.biz/repo/biz/aQute/bnd/0.0.313/bnd-0.0.313.jar
java -jar bnd-0.0.313.jar wrap yamlbeans-0.9.2.jar
mv yamlbeans-0.9.2.bar yamlbeans-osgi-0.9.2.jar

