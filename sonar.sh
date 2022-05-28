ant
sonar-scanner \
  -Dsonar.organization=ufba-poo-2022-1 \
  -Dsonar.projectKey=ufba-poo-2022-1_equipe4 \
  -Dsonar.host.url=https://sonarcloud.io \
  -Dsonar.sources=. \
	-Dsonar.java.binaries=.
