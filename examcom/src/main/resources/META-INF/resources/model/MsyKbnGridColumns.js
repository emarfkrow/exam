/**
 * 区分マスタグリッド定義
 */

let MsyKbnGridColumns = [];

$(function() {
    MsyKbnGridColumns = [
        Column.text('KBN_NM', Messages['MsyKbnGrid.kbnNm'], 160, 'primaryKey', null),
        Column.text('KBN_MEI', Messages['MsyKbnGrid.kbnMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['MsyKbnGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['MsyKbnGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['MsyKbnGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
