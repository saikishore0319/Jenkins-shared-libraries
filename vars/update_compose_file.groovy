def call(String tag, String docker_user){
  sh '''
      sed -i 's| image: ${docker_user}/techify-backend:.*|image: image: ${docker_user}/techify-backend:${tag}'
      sed -i 's| image: ${docker_user}/techify-frontend:.*|image: image: ${docker_user}/techify-frontend:${tag}'
    '''
}
