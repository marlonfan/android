package com.github.gotify

import io.noties.prism4j.annotations.PrismBundle

@PrismBundle(
    includes = ["kotlin", "java", "javascript", "python", "json", "xml", "bash", "sql"],
    grammarLocatorClassName = ".Prism4jGrammarLocator"
)
class PrismConfiguration
