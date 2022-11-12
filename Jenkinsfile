@Library("spring-demo") _
pipeline {

    agent any

    tools {

        maven 'MAVEN_HOME'

    }

    stages {

        stage("Checkout Repo") {

            steps {

                script{

                    task1.checkout()

                }

            }

        }

        stage("Build Application") {

            steps {

                script{

                    task1.build()

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
