/**
 * VIEWグリッド定義
 */

let Vb9HenkanGridColumns = [];

$(function() {
    Vb9HenkanGridColumns = [
        Column.text('src_id', Messages['Vb9HenkanGrid.srcId'], 90, '', null),
        Column.text('dest_info', Messages['Vb9HenkanGrid.destInfo'], 300, '', null),
    ];
});
