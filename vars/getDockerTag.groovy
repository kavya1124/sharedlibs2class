def call(){
    return sh(returnstdout: true, script:'git rev-parse --short HEAD')
}