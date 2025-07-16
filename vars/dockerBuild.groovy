def call(String image_name, String tag, String dockerhub_user){
  sh "docker build -t ${dockerhub_user}/${image_name}:${tag} ."
}
