(set-env!
 :source-paths    #{"source/clj-css"}
 :dependencies '[[org.martinklepsch/boot-garden "1.3.0-0"]
                 [prismatic/plumbing          "0.5.2"]
                 [danielsz/boot-autoprefixer "0.0.7"]])

(require
 '[org.martinklepsch.boot-garden :refer [garden]]
 '[danielsz.autoprefixer :refer [autoprefixer]])

(deftask css []
  (set-env!
    :source-paths #(conj % "source/styles"))
  (task-options! garden {:styles-var   'offcourse.styles.index/base
                         :output-to    "main.css"
                         :pretty-print true}
                 target {:dir #{".build-boot/stylesheets/"}}
                 autoprefixer {:files ["main.css"]
                               :browsers "last 5 versions"})
  (println "Task: CSS")
  (comp (garden)
        (autoprefixer)
        (target)))

(deftask dev []
  (println "External pipeline: Boot \n\n")
  (println "Task: Development (dev)")
  (comp (watch)
        (css)))
