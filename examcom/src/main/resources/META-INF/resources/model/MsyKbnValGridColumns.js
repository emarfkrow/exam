/**
 * 区分値マスタグリッド定義
 */

let MsyKbnValGridColumns = [
    Column.refer('KBN_NM', Messages['MsyKbnValGrid.kbnNm'], 160, 'primaryKey', 'null'),
    Column.text('KBN_VAL', Messages['MsyKbnValGrid.kbnVal'], 30, 'primaryKey', null),
    Column.text('KBN_VAL_MEI', Messages['MsyKbnValGrid.kbnValMei'], 300, 'notblank', null),
    Column.comma('HYOJI_ON', Messages['MsyKbnValGrid.hyojiOn'], 80, 'notblank', null),
    Column.text('CRITERIA', Messages['MsyKbnValGrid.criteria'], 300, '', null),
    Column.check('DELETE_F', Messages['MsyKbnValGrid.deleteF'], 30, ''),
];
