<#macro vaultLayout>
<#import "/spring.ftl" as spring />
<#assign sec=JspTaglibs["http://www.springframework.org/security/tags"] />
<@sec.authentication var="principal" property="principal" />
<html>
<head>

    <#include "imports.ftl"/>

</head>
<body>

    <#include "header.ftl"/>
    <#nested/>
    <#include "footer.ftl"/>

</body>
</html>
</#macro>