/**
 * 区分マスタグリッド定義
 */

let MsyKbnGridColumns = [
    Column.text('KBN_NM', Messages['MsyKbnGrid.kbnNm'], 160, 'primaryKey', null),
    Column.text('KBN_MEI', Messages['MsyKbnGrid.kbnMei'], 300, 'notblank', null),
    Column.check('DELETE_F', Messages['MsyKbnGrid.deleteF'], 30, ''),
];
