#########################################

This File contains the jenkins pipeline script for the project done for the shared library

########################################

First :

@Library('jenkinslibrary') _
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                script{
                    // Both below statement could be used to work with the global vars functions
                     // globalmethodvariable.printnamestatement  "Amit Kumar"
                     globalmethodvariable("Amit Kumar")
                }
            }
        }
    }
}



Second:

@Library("jenkinslibrary") _
import com.acceleratedskillup.*
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                script{
                     def calc= new Calculator()    
                     println calc.add(1,2)
                     
                }
                
            }
        }
    }
}




Third:


@Library("jenkinslibrary") _
import com.acceleratedskillup.*
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                script{
                    def car=new Car(this)
                    car.printcarout()
                    echo "The Number OF ddors from Script: ${car.NoofDoors}"
                }
            }
        }
    }
}


Fourth:

######################################################
Static Method call fully qualified name use to load the function dynamically.
For me this didnt worked 



pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                    script{
                        Library("jenkinslibrary").src.com.acceleratedskillup.Validator.validatorfunc(this)
                    }
            }
        }
    }
}


Fifth:

@Library("jenkinslibrary") _
import com.acceleratedskillup.*

pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                script{
                    Validator.validatorfunc(this)
                }
            }
        }
    }
}


##################################################################################

Using the custom step for maven version or maven command execution

@Library('jenkinslibrary') _
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                execMaven("--help")
                execMaven()
            }
        }
    }
}

