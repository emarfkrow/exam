/**
 * 区分マスタグリッド定義
 */

let MsyKbnGridColumns = [];

$(function() {
    MsyKbnGridColumns = [
        Column.text('KBN_NM', Messages['MsyKbnGrid.kbnNm'], 160, 'primaryKey', null),
        Column.text('KBN_MEI', Messages['MsyKbnGrid.kbnMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['MsyKbnGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
