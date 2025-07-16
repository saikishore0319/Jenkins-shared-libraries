def call(String url, String branch, String cred) {
git(
       branch: branch,
        url: url,
        credentialsId: cred
   )
}
