def call(String tag, String docker_user){
  sh """
      sed -i 's|image: ${docker_user}/techify-backend:.*|image: ${docker_user}/techify-backend:${tag}'  docker-compose.yml
      sed -i 's|image: ${docker_user}/techify-frontend:.*|image: ${docker_user}/techify-frontend:${tag}'  docker-compose.yml
    """
}
