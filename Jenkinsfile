node {
	stage ('Clone git') {            
         git credentialsId: 'b6b7cdc2-fa5a-461a-8524-fa4d6e951b48', url: 'https://github.com/kedartalegaonkar/OpenBrowserWithoutExe.git'
             }
        
         stage ('Build') {
                def mvntool = tool name: 'MAVEN_HOME', type: 'maven'
                bat(/'mvn clean test'/)
               }
}
