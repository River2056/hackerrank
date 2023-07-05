# srcfile:=$(shell ls -R | grep -i "$(test).*Test.java" | sed "s/.java$///")
srcFile:=$(shell ls -R | grep -i "$(filename).*.java" | xargs find . -iname | sed "s/.\/app\/src\/main\/java\///" | sed "s/.java$///" | sed "s/\//./g")

run:
	gradle clean
	gradle -PmainClass=$(srcFile) build
	rm -rf ./app/build/distributions/app
	unzip ./app/build/distributions/app.zip -d ./app/build/distributions/
	./app/build/distributions/app/bin/app

build:
	gradle clean
	gradle -PmainClass=$(srcFile) build
