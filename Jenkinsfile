node {
     environment {
    PATH = "C:\\Program Files\\Git\\usr\\bin;C:\\Program Files\\Git\\bin;${env.PATH}"
     }
     stage('SCM Checkout Deepak') {
        git 'https://github.com/aryanrai13/firstprogram'
        }
     
     stage('Compile package choti') {
        sh 'mvn package'
        }
   
}
