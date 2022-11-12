def checkout(){
  git branch: 'hello-world-spring-boot', url: 'https://github.com/SumeetBandgar/Java.git'
}

def build(){
 sh "mvn clean install"
}
