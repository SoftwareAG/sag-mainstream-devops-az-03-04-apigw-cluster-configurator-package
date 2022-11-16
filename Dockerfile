ARG __base_image=sagcr.azurecr.io/apigateway-minimal:10.11
FROM ${__base_image}

COPY ./code/is-packages/WxApiGwClusterConfigurator/ ${SAG_HOME}/IntegrationServer/instances/default/packages/WxApiGwClusterConfigurator/
