(set-env!
 :source-paths    #{"source/clj-css"}
 :dependencies '[[org.martinklepsch/boot-garden "1.3.0-0"]
                 [prismatic/plumbing          "0.5.2"]])

(require
 '[org.martinklepsch.boot-garden :refer [garden]])

(deftask css []
  (set-env! 
    :source-paths #(conj % "source/clj-css"))
  (task-options! garden {:styles-var   'offcourse.styles.index/base
                         :vendors ["webkit" "moz"]
                         :auto-prefix #{:user-select :column-count :column-gap}
                         :output-to    "main.css.scss"
                         :pretty-print true}
                 target {:dir #{"source/stylesheets/"}})
  (comp (watch)
        (garden)
        (target)))