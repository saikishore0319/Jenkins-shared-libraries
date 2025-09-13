def call(String creds, String image, String image_tag){
  withCredentials([usernamePassword(credentialsId:creds, passwordVariable: 'dockerhubpass',usernameVariable: 'dockerhubuser')]){
       sh """
      echo \$dockerhubpass | docker login -u \$dockerhubuser --password-stdin
      docker push \$dockerhubuser/${image}:${image_tag}
    """
  }
}
