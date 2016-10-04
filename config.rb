# Per-page layout changes:
# With no layout
page '/*.xml', layout: false
page '/*.json', layout: false
page '/*.txt', layout: false

# Activate blog gems
activate :blog do |blog|
  blog.name = "team"
  blog.sources = "content/team/{title}.html"
  blog.permalink = "team/{title}.html"
end

activate :blog do |blog|
  blog.name = "documentation"
  blog.sources = "content/documentation/{title}.html"
  blog.permalink = "documentation/{title}.html"
  blog.custom_collections = {
    page: {
      link: "/documentation/:page.html",
      template: "/documentation.html"
    }
  }
end

activate :blog do |blog|
  blog.name = "marketing"
  blog.sources = "content/marketing/{title}.html"
  blog.permalink = "marketing/{title}.html"
  blog.custom_collections = {
    page: {
      link: "/:page.html",
      template: "/marketing.html"
    }
  }
end

# General configuration
configure :development do

  # Integrate Clojure Garden CSS Transpilation
  activate :external_pipeline,
    name: :garden,
    command: "boot dev",
    source: ".build-boot",
    latency: 2

  # Live reload
  activate :livereload
end

# Build-specific configuration
configure :build do

  # Integrate Clojure Garden CSS Transpilation
  activate :external_pipeline,
    name: :garden,
    command: "boot css",
    command: "./boot css",
    source: ".build-boot",
    latency: 2
end
