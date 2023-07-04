# srcfile:=$(shell ls -R | grep -i "$(test).*Test.java" | sed "s/.java$///")
srcFile:=$(shell ls -R | grep -i "$(filename).*.java" | xargs find . -iname | sed "s/.\/app\/src\/main\/java\///" | sed "s/.java$///" | sed "s/\//./g")
run:
	# gradle clean test --tests $(srcfile)
	gradle -PmainClass=$(srcFile) run
