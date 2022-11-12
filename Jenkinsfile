@Library("javahome-demo") _
pipeline {

    agent any

    tools {

        maven 'MAVEN_HOME'

    }

    stages {

        stage("Checkout Repo") {

            steps {

                script{

                    welcome.checkout()

                }

            }

        }

        stage("Build Application") {

            steps {

                script{

                    welcome.build()

                }

            }

            
            post {

                success {

                    archiveArtifacts 'target/*.jar'

                }

            }

        }

    }

}
