# Per-page layout changes:
# With no layout
page '/*.xml', layout: false
page '/*.json', layout: false
page '/*.txt', layout: false

# Activate blog gems
activate :blog do |blog|
  blog.name = "frontpage"
  blog.sources = "content/frontpage/{title}.html"
  blog.permalink = "frontpage/{title}.html"
end

activate :blog do |blog|
  blog.name = "team"
  blog.sources = "content/team/{title}.html"
  blog.permalink = "team/{title}.html"
end

activate :blog do |blog|
  blog.name = "documentation"
  blog.sources = "content/documentation/{title}.html"
  blog.permalink = "documentation/{title}.html"
end

pages = ["animations", "assets", "colors", "modules", "email", "logos", "manifest", "infosite", "platform", "presentations", "rewards", "typography", "writing"]
pages.each do |page|
  proxy "/documentation/#{page}.html", "/documentation.html", :locals => { :page => page, :title => page }, :ignore => true
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
    # command: "boot css",
    command: "./boot css",
    source: ".build-boot",
    latency: 2
end