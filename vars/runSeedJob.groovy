def call(String seedScriptPath, Map additionalParameters = [:]) {
    if (!fileExists(seedScriptPath)) {
        error "Seed script not found: ${seedScriptPath}"
    }
    echo "Seed script approved: ${seedScriptPath}"

    jobDsl(
        targets: seedScriptPath,
        additionalParameters: additionalParameters,
        sandbox: false 
    )
}